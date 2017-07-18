package com.asofdate.batch.dao;

import com.asofdate.batch.entity.BatchJobStatusEntity;

import java.util.List;

/**
 * Created by hzwy23 on 2017/6/17.
 */
public interface BatchJobRunningDao {
    List<BatchJobStatusEntity> findAll(String batchId, String suiteKey,String asOfDate);

    BatchJobStatusEntity getDetails(String batchId, String suiteKey, String jobKey);
}
