package model;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SinhVienDAO {

	public static SessionFactory getSessionFactory() {
		try {
			SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			return factory;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}

	public boolean addStudent(SinhVien sv) {
		SessionFactory factory = getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.save(sv);
			tx.commit();
			return true;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			if (tx != null)
				tx.rollback();
		} finally {
			session.close();
		}
		return false;
	}

	public void updateSinhVien(SinhVien sv) {
		SessionFactory factory = getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			SinhVien sv1 = (SinhVien) session.get(SinhVien.class, sv.getMa_sv());
			sv1.setHoten(sv.getHoten());
			sv1.setDiachi(sv.getDiachi());
			sv1.setEmail(sv.getEmail());
			sv1.setNamsinh(sv.getNamsinh());
			sv1.setPhai(sv.getPhai());
			sv1.setSodienthoai(sv.getSodienthoai());
			session.update(sv1);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	public void deleteEmployee(Integer ma_sv) {
		SessionFactory factory = getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			SinhVien sv = (SinhVien) session.get(SinhVien.class, ma_sv);
			session.delete(sv);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
	public List listSV(){
		SessionFactory factory = getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = null;
		List listSV = new ArrayList<SinhVien>();
		try {
			tx = session.beginTransaction();
			listSV = session.createQuery("From SinhVien").list();
			tx.commit();
			return listSV;
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return null;
	}

}
