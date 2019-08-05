function New-ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${cqPeriodsearchpromotePeriodconfigurationPeriodserverPerioduri},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${cqPeriodsearchpromotePeriodconfigurationPeriodenvironment},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${connectionPeriodtimeout},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${socketPeriodtimeout}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties -ArgumentList @(
            ${cqPeriodsearchpromotePeriodconfigurationPeriodserverPerioduri},
            ${cqPeriodsearchpromotePeriodconfigurationPeriodenvironment},
            ${connectionPeriodtimeout},
            ${socketPeriodtimeout}
        )
    }
}
