function New-ComDayCqCommonsServletsRootMappingServletProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${rootmappingPeriodtarget}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqCommonsServletsRootMappingServletProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqCommonsServletsRootMappingServletProperties -ArgumentList @(
            ${rootmappingPeriodtarget}
        )
    }
}
