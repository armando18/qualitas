package com.googlecode.qualitas.engines.api.core;

import java.io.IOException;

import javax.xml.namespace.QName;

import com.googlecode.qualitas.engines.api.configuration.ProcessType;

/**
 * The Interface ProcessBundle.
 */
public interface Bundle {

    /**
     * Every uploaded archive which user want to enhance should have qualitas
     * descriptor.
     */
    String QUALITAS_CONFIGURATION_NAME = "qualitas.xml";

    /**
     * Gets the process type.
     * 
     * @return the process type
     */
    ProcessType getProcessType();

    /**
     * Sets the bundle.
     * 
     * @param bundle
     *            the contents of bundle
     * @throws IOException
     *             the IO exception
     */
    void setBundle(byte[] bundle) throws IOException;

    /**
     * Builds the bundle.
     * 
     * @return the byte[]
     * @throws IOException
     *             the IO exception
     */
    byte[] buildBundle() throws IOException;

    /**
     * Sets the main process name.
     * 
     * @param mainProcessQName
     *            the new main process qname
     */
    void setMainProcessQName(QName mainProcessQName);

    /**
     * Gets the main process name.
     * 
     * @return the main process name
     */
    QName getMainProcessQName();

    /**
     * Gets the qualitas configuration.
     * 
     * @return the qualitas configuration
     * @throws IOException
     *             the IO exception
     */
    Entry getQualitasConfiguration() throws IOException;

    /**
     * Gets the main process definition.
     * 
     * @return the main process definition
     * @throws IOException
     *             the IO exception
     */
    Entry getMainProcessDefinition() throws IOException;

    /**
     * Checks if is instrumentable. Returns true if scenario bundle contains
     * qualitas descriptor.
     * 
     * @return true, if is instrumentable
     * @throws IOException
     *             the IO exception
     */
    boolean isInstrumentable() throws IOException;

    /**
     * Gets entry by name.
     * 
     * @param name
     *            the name
     * @return the entry
     * @throws IOException
     *             the IO exception
     */
    Entry getEntry(String name) throws IOException;

    /**
     * Adds given entry.
     * 
     * @param entry
     *            the entry
     * @throws IOException
     *             the IO exception
     */
    void addEntry(Entry entry) throws IOException;

    /**
     * Removes given entry.
     * 
     * @param entryName
     *            the entry name
     * @throws IOException
     *             the IO exception
     */
    void removeEntry(String entryName) throws IOException;

    /**
     * Renames existing entry.
     * 
     * @param oldName
     *            the old name
     * @param newName
     *            the new name
     * @throws IOException
     *             the IO exception
     */
    void renameEntry(String oldName, String newName) throws IOException;

    /**
     * Releases and removes all allocated resources..
     * 
     * @throws IOException
     *             the IO exception
     */
    void cleanUp() throws IOException;
}
