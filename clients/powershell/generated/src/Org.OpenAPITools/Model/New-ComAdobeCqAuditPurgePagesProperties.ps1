function New-ComAdobeCqAuditPurgePagesProperties {
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
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqAuditPurgePagesProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqAuditPurgePagesProperties -ArgumentList @(
            ${auditlogPeriodrulePeriodname},
            ${auditlogPeriodrulePeriodcontentpath},
            ${auditlogPeriodrulePeriodminimumage},
            ${auditlogPeriodrulePeriodtypes}
        )
    }
}
