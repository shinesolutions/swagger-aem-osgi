function New-ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${hcPeriodtags},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${diskPeriodspacePeriodwarnPeriodthreshold},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${diskPeriodspacePerioderrorPeriodthreshold}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties -ArgumentList @(
            ${hcPeriodtags},
            ${diskPeriodspacePeriodwarnPeriodthreshold},
            ${diskPeriodspacePerioderrorPeriodthreshold}
        )
    }
}
