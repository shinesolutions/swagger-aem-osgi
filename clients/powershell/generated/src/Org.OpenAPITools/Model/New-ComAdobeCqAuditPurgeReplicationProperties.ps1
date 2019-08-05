function New-ComAdobeCqAuditPurgeReplicationProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${auditlogPeriodrulePeriodname},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${auditlogPeriodrulePeriodcontentpath},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${auditlogPeriodrulePeriodminimumage},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyDropDown]]
        ${auditlogPeriodrulePeriodtypes}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqAuditPurgeReplicationProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqAuditPurgeReplicationProperties -ArgumentList @(
            ${auditlogPeriodrulePeriodname},
            ${auditlogPeriodrulePeriodcontentpath},
            ${auditlogPeriodrulePeriodminimumage},
            ${auditlogPeriodrulePeriodtypes}
        )
    }
}
