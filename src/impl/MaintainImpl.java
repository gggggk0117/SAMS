package impl;

import bense.Maintain;
import dao.MaintainDao;

import java.util.List;

public class MaintainImpl implements MaintainDao {
    @Override
    public List<Maintain> getAllMaintain() {
        return null;
    }

    @Override
    public int insertMaintain(Maintain mat) {
        return 0;
    }

    @Override
    public int updateStudents(Maintain mat) {
        return 0;
    }

    @Override
    public int deleteStudents(String student_name, String student_dnum) {
        return 0;
    }

    @Override
    public Maintain find(String student_name, String student_dnum) {
        return null;
    }
}
