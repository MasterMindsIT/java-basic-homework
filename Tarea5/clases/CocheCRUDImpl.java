package clases;

import interfaces.CocheCRUD;

public class CocheCRUDImpl implements CocheCRUD {
    @Override
    public void save() {
        System.out.println("save coche");
    }

    @Override
    public void findAll() {
        System.out.println("findAll coche");
    }

    @Override
    public void delete() {
        System.out.println("delete coche");
    }
}
