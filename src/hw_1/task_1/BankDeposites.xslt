<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
            <body>
                <center>
                    <h2>
                        <font face="Luminari">BANK DEPOSITES</font>
                    </h2>
                </center>
                <table border="2">
                    <tr bgcolor="#FFFFE0">
                        <font face="Arial">
                            <font size="6">
                                <th>Type</th>
                                <th>Name</th>
                                <th>Country</th>
                                <th>Depositor</th>
                                <th>Account ID</th>
                                <th>Amount</th>
                                <th>Profitability (%)</th>
                                <th>Time constraints</th>
                            </font>
                        </font>
                    </tr>
                    <xsl:for-each select="bank/deposit">
                        <tr>
                            <td>
                                <xsl:value-of select="@type"/>
                            </td>
                            <td>
                                <xsl:value-of select="@name"/>
                            </td>
                            <td>
                                <xsl:value-of select="country"/>
                            </td>
                            <td>
                                <xsl:value-of select="depositor"/>
                            </td>
                            <td>
                                <xsl:value-of select="account_id"/>
                            </td>
                            <td>
                                <xsl:value-of select="amount"/>
                            </td>
                            <td>
                                <xsl:value-of select="profitability"/>
                            </td>
                            <td>
                                <xsl:value-of select="time_constraints"/>
                            </td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>