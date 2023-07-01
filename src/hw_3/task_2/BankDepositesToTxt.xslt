<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="text" indent="no"/>

    <xsl:template match="/">
        <xsl:apply-templates select="bank"/>
    </xsl:template>

    <xsl:template match="bank">
        <xsl:apply-templates select="deposit"/>
    </xsl:template>

    <xsl:template match="deposit">
        <xsl:text>Deposit Type:</xsl:text>
        <xsl:value-of select="@type"/><xsl:text>&#10;</xsl:text>
        <xsl:text>Name: </xsl:text>
        <xsl:value-of select="@name"/><xsl:text>&#10;</xsl:text>
        <xsl:text>Country: </xsl:text>
        <xsl:value-of select="country"/><xsl:text>&#10;</xsl:text>
        <xsl:text>Depositor: </xsl:text>
        <xsl:value-of select="depositor"/><xsl:text>&#10;</xsl:text>
        <xsl:text>Account ID: </xsl:text>
        <xsl:value-of select="account_id"/><xsl:text>&#10;</xsl:text>
        <xsl:text>Amount: </xsl:text>
        <xsl:value-of select="amount"/><xsl:text>&#10;</xsl:text>
        <xsl:text>Profitability: </xsl:text>
        <xsl:value-of select="profitability"/><xsl:text>&#10;</xsl:text>
        <xsl:text>Time Constraints: </xsl:text>
        <xsl:value-of select="time_constraints"/><xsl:text>&#10;&#10;</xsl:text>
    </xsl:template>

</xsl:stylesheet>
