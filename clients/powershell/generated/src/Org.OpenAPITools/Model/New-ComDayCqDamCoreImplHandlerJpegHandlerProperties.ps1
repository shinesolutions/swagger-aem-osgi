function New-ComDayCqDamCoreImplHandlerJpegHandlerProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${cqPerioddamPeriodenablePeriodextPeriodmetaPeriodextraction},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${largeUnderscorefileUnderscorethreshold},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${largeUnderscorecommentUnderscorethreshold}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqDamCoreImplHandlerJpegHandlerProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqDamCoreImplHandlerJpegHandlerProperties -ArgumentList @(
            ${cqPerioddamPeriodenablePeriodextPeriodmetaPeriodextraction},
            ${largeUnderscorefileUnderscorethreshold},
            ${largeUnderscorecommentUnderscorethreshold}
        )
    }
}
