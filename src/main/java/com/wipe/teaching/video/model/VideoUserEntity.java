package com.wipe.teaching.video.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * VideoUserEntity
 *
 * @author MaoChang Wu
 * @date 2017/10/04 11:50
 */

@Entity
@Table(name = "video_user_entity", uniqueConstraints = @UniqueConstraint(columnNames = "username,id"))
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VideoUserEntity {
    @Id
    @GeneratedValue
    private Long id;
    @Column(unique = true, columnDefinition = "VARCHAR(100)")
    private String username;
    @Column(columnDefinition = "VARCHAR(64)")
    private String password;
    @Column(columnDefinition = "VARCHAR(200)")
    private String roles;
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    @Column(updatable = false)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createDateTime;
    @Temporal(TemporalType.TIMESTAMP)
    @UpdateTimestamp
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date lastUpdateDateTime;

}
