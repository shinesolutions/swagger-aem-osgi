function New-ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${cqPerioddamPeriodscene7PeriodconfigurationeventlistenerPeriodenabled}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties -ArgumentList @(
            ${cqPerioddamPeriodscene7PeriodconfigurationeventlistenerPeriodenabled}
        )
    }
}
