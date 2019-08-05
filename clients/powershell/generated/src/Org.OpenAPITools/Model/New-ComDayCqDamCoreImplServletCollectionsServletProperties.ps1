function New-ComDayCqDamCoreImplServletCollectionsServletProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${cqPerioddamPeriodbatchPeriodcollectionsPeriodproperties},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${cqPerioddamPeriodbatchPeriodcollectionsPeriodlimit}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqDamCoreImplServletCollectionsServletProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqDamCoreImplServletCollectionsServletProperties -ArgumentList @(
            ${cqPerioddamPeriodbatchPeriodcollectionsPeriodproperties},
            ${cqPerioddamPeriodbatchPeriodcollectionsPeriodlimit}
        )
    }
}
