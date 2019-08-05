function New-ComDayCqDamCoreImplServletCollectionServletProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${cqPerioddamPeriodbatchPeriodcollectionPeriodproperties},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${cqPerioddamPeriodbatchPeriodcollectionPeriodmaxcollections}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqDamCoreImplServletCollectionServletProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqDamCoreImplServletCollectionServletProperties -ArgumentList @(
            ${cqPerioddamPeriodbatchPeriodcollectionPeriodproperties},
            ${cqPerioddamPeriodbatchPeriodcollectionPeriodmaxcollections}
        )
    }
}
