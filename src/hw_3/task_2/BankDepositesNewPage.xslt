<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

    <xsl:output method="html" indent="yes"/>

    <xsl:template match="/">
        <html>
            <head>
                <style>
                    @page {
                    size: 8.5in 11in;
                    margin: 1in;
                    }
                </style>
            </head>
            <body>
                <xsl:apply-templates select="bank/deposit"/>
            </body>
        </html>
    </xsl:template>

    <xsl:template match="deposit">
        <div style="page-break-before: always;">
            <h2>Deposit Type:
                <xsl:value-of select="@type"/>
            </h2>
            <p>Name:
                <xsl:value-of select="@name"/>
            </p>
            <p>Country:
                <xsl:value-of select="country"/>
            </p>
            <p>Depositor:
                <xsl:value-of select="depositor"/>
            </p>
            <p>Account ID:
                <xsl:value-of select="account_id"/>
            </p>
            <p>Amount:
                <xsl:value-of select="amount"/>
            </p>
            <p>Profitability:
                <xsl:value-of select="profitability"/>
            </p>
            <p>Time Constraints:
                <xsl:value-of select="time_constraints"/>
            </p>
        </div>
    </xsl:template>

</xsl:stylesheet>