package impl;

import bense.Sanitary;
import dao.SanitaryDao;

import java.util.List;

public class SanitaryImpl implements SanitaryDao {
    @Override
    public List<Sanitary> getAllSanitary() {
        return null;
    }

    @Override
    public int insertSanitary(Sanitary san) {
        return 0;
    }

    @Override
    public int updateSanitary(Sanitary san) {
        return 0;
    }

    @Override
    public int deleteSanitary(String student_dnum) {
        return 0;
    }

    @Override
    public Sanitary find(String student_dnum) {
        return null;
    }

    @Override
    public Sanitary findNum(int sanitary_num) {
        return null;
    }
}
