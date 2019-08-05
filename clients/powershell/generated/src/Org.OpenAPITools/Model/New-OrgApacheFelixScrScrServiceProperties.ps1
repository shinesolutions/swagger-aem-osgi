function New-OrgApacheFelixScrScrServiceProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyDropDown]]
        ${dsPeriodloglevel},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${dsPeriodfactoryPeriodenabled},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${dsPerioddelayedPeriodkeepInstances},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${dsPeriodlockPeriodtimeoutPeriodmilliseconds},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${dsPeriodstopPeriodtimeoutPeriodmilliseconds},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${dsPeriodglobalPeriodextender}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheFelixScrScrServiceProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheFelixScrScrServiceProperties -ArgumentList @(
            ${dsPeriodloglevel},
            ${dsPeriodfactoryPeriodenabled},
            ${dsPerioddelayedPeriodkeepInstances},
            ${dsPeriodlockPeriodtimeoutPeriodmilliseconds},
            ${dsPeriodstopPeriodtimeoutPeriodmilliseconds},
            ${dsPeriodglobalPeriodextender}
        )
    }
}
