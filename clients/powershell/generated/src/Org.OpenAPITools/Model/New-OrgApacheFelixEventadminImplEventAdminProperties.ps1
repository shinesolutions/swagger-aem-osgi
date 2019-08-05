function New-OrgApacheFelixEventadminImplEventAdminProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${orgPeriodapachePeriodfelixPeriodeventadminPeriodThreadPoolSize},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyFloat]]
        ${orgPeriodapachePeriodfelixPeriodeventadminPeriodAsyncToSyncThreadRatio},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${orgPeriodapachePeriodfelixPeriodeventadminPeriodTimeout},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${orgPeriodapachePeriodfelixPeriodeventadminPeriodRequireTopic},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${orgPeriodapachePeriodfelixPeriodeventadminPeriodIgnoreTimeout},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${orgPeriodapachePeriodfelixPeriodeventadminPeriodIgnoreTopic}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheFelixEventadminImplEventAdminProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheFelixEventadminImplEventAdminProperties -ArgumentList @(
            ${orgPeriodapachePeriodfelixPeriodeventadminPeriodThreadPoolSize},
            ${orgPeriodapachePeriodfelixPeriodeventadminPeriodAsyncToSyncThreadRatio},
            ${orgPeriodapachePeriodfelixPeriodeventadminPeriodTimeout},
            ${orgPeriodapachePeriodfelixPeriodeventadminPeriodRequireTopic},
            ${orgPeriodapachePeriodfelixPeriodeventadminPeriodIgnoreTimeout},
            ${orgPeriodapachePeriodfelixPeriodeventadminPeriodIgnoreTopic}
        )
    }
}
