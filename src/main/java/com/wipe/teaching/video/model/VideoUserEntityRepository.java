package com.wipe.teaching.video.model;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * VideoUserEntityRepository
 *
 * @author MaoChang Wu
 * @date 2017/10/04 12:13
 */
public interface VideoUserEntityRepository extends JpaRepository<VideoUserEntity,Long> {
    Optional<VideoUserEntity> findByUsername(String name);
}
