package com.service;

import com.pojo.Paper;

import java.util.List;

public interface PaperService {
    int addPaper(Paper paper);
    int deletePaperById(Long paper);
    int updatePaper(Paper paper);
    Paper queryById(long id);
    List<Paper> queryAllPaper();
}
