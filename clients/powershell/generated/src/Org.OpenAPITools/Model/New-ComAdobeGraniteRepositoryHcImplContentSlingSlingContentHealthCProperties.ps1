function New-ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${hcPeriodtags},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${excludePeriodsearchPeriodpath}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties -ArgumentList @(
            ${hcPeriodtags},
            ${excludePeriodsearchPeriodpath}
        )
    }
}
