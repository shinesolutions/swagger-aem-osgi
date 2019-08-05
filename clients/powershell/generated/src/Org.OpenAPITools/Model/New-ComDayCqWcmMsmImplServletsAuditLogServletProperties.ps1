function New-ComDayCqWcmMsmImplServletsAuditLogServletProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${auditlogservletPerioddefaultPeriodeventsPeriodcount},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${auditlogservletPerioddefaultPeriodpath}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqWcmMsmImplServletsAuditLogServletProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqWcmMsmImplServletsAuditLogServletProperties -ArgumentList @(
            ${auditlogservletPerioddefaultPeriodeventsPeriodcount},
            ${auditlogservletPerioddefaultPeriodpath}
        )
    }
}
