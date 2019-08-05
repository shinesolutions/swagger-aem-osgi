function New-ComAdobeCqAuditPurgeDamProperties {
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
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqAuditPurgeDamProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqAuditPurgeDamProperties -ArgumentList @(
            ${auditlogPeriodrulePeriodname},
            ${auditlogPeriodrulePeriodcontentpath},
            ${auditlogPeriodrulePeriodminimumage},
            ${auditlogPeriodrulePeriodtypes}
        )
    }
}
