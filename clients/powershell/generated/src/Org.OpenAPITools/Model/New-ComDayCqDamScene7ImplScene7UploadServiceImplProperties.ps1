function New-ComDayCqDamScene7ImplScene7UploadServiceImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${cqPerioddamPeriodscene7PerioduploadservicePeriodactivejobtimeoutPeriodlabel},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${cqPerioddamPeriodscene7PerioduploadservicePeriodconnectionmaxperroutePeriodlabel}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqDamScene7ImplScene7UploadServiceImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqDamScene7ImplScene7UploadServiceImplProperties -ArgumentList @(
            ${cqPerioddamPeriodscene7PerioduploadservicePeriodactivejobtimeoutPeriodlabel},
            ${cqPerioddamPeriodscene7PerioduploadservicePeriodconnectionmaxperroutePeriodlabel}
        )
    }
}
