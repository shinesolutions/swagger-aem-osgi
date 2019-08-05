function New-ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${binaryPeriodthreshold}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties -ArgumentList @(
            ${binaryPeriodthreshold}
        )
    }
}
