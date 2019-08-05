function New-ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${cachePeriodenable},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${cachePeriodrootPaths},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${cachePeriodmaxSize},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${cachePeriodmaxEntries}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties -ArgumentList @(
            ${cachePeriodenable},
            ${cachePeriodrootPaths},
            ${cachePeriodmaxSize},
            ${cachePeriodmaxEntries}
        )
    }
}
