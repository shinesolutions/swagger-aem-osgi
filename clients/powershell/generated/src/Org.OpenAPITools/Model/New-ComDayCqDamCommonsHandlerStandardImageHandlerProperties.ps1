function New-ComDayCqDamCommonsHandlerStandardImageHandlerProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${largeUnderscorefileUnderscorethreshold},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${largeUnderscorecommentUnderscorethreshold},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${cqPerioddamPeriodenablePeriodextPeriodmetaPeriodextraction}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqDamCommonsHandlerStandardImageHandlerProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqDamCommonsHandlerStandardImageHandlerProperties -ArgumentList @(
            ${largeUnderscorefileUnderscorethreshold},
            ${largeUnderscorecommentUnderscorethreshold},
            ${cqPerioddamPeriodenablePeriodextPeriodmetaPeriodextraction}
        )
    }
}
