function New-ComDayCqWcmCoreImplServletsReferenceSearchServletProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${referencesearchservletPeriodmaxReferencesPerPage},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${referencesearchservletPeriodmaxPages}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqWcmCoreImplServletsReferenceSearchServletProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqWcmCoreImplServletsReferenceSearchServletProperties -ArgumentList @(
            ${referencesearchservletPeriodmaxReferencesPerPage},
            ${referencesearchservletPeriodmaxPages}
        )
    }
}
