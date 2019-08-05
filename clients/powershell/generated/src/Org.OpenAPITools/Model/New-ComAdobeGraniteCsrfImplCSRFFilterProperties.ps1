function New-ComAdobeGraniteCsrfImplCSRFFilterProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${filterPeriodmethods},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${filterPeriodenablePeriodsafePerioduserPeriodagents},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${filterPeriodsafePerioduserPeriodagents},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${filterPeriodexcludedPeriodpaths}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteCsrfImplCSRFFilterProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteCsrfImplCSRFFilterProperties -ArgumentList @(
            ${filterPeriodmethods},
            ${filterPeriodenablePeriodsafePerioduserPeriodagents},
            ${filterPeriodsafePerioduserPeriodagents},
            ${filterPeriodexcludedPeriodpaths}
        )
    }
}
