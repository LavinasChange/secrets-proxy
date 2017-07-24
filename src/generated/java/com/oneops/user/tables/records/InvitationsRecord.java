/*
 * This file is generated by jOOQ.
*/
package com.oneops.user.tables.records;


import com.oneops.user.tables.Invitations;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InvitationsRecord extends UpdatableRecordImpl<InvitationsRecord> implements Record6<Integer, String, String, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = 808226541;

    /**
     * Setter for <code>public.invitations.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.invitations.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.invitations.email</code>.
     */
    public void setEmail(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.invitations.email</code>.
     */
    public String getEmail() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.invitations.token</code>.
     */
    public void setToken(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.invitations.token</code>.
     */
    public String getToken() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.invitations.comment</code>.
     */
    public void setComment(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.invitations.comment</code>.
     */
    public String getComment() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.invitations.created_at</code>.
     */
    public void setCreatedAt(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.invitations.created_at</code>.
     */
    public Timestamp getCreatedAt() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>public.invitations.updated_at</code>.
     */
    public void setUpdatedAt(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.invitations.updated_at</code>.
     */
    public Timestamp getUpdatedAt() {
        return (Timestamp) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, String, String, String, Timestamp, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, String, String, String, Timestamp, Timestamp> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Invitations.INVITATIONS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Invitations.INVITATIONS.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Invitations.INVITATIONS.TOKEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Invitations.INVITATIONS.COMMENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return Invitations.INVITATIONS.CREATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return Invitations.INVITATIONS.UPDATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getToken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getComment();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvitationsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvitationsRecord value2(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvitationsRecord value3(String value) {
        setToken(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvitationsRecord value4(String value) {
        setComment(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvitationsRecord value5(Timestamp value) {
        setCreatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvitationsRecord value6(Timestamp value) {
        setUpdatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvitationsRecord values(Integer value1, String value2, String value3, String value4, Timestamp value5, Timestamp value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached InvitationsRecord
     */
    public InvitationsRecord() {
        super(Invitations.INVITATIONS);
    }

    /**
     * Create a detached, initialised InvitationsRecord
     */
    public InvitationsRecord(Integer id, String email, String token, String comment, Timestamp createdAt, Timestamp updatedAt) {
        super(Invitations.INVITATIONS);

        set(0, id);
        set(1, email);
        set(2, token);
        set(3, comment);
        set(4, createdAt);
        set(5, updatedAt);
    }
}