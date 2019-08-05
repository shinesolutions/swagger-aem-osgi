function New-ComDayCqDamCoreImplUnzipUnzipConfigProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${cqPerioddamPeriodconfigPeriodunzipPeriodmaxuncompressedsize},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${cqPerioddamPeriodconfigPeriodunzipPeriodencoding}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqDamCoreImplUnzipUnzipConfigProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqDamCoreImplUnzipUnzipConfigProperties -ArgumentList @(
            ${cqPerioddamPeriodconfigPeriodunzipPeriodmaxuncompressedsize},
            ${cqPerioddamPeriodconfigPeriodunzipPeriodencoding}
        )
    }
}
