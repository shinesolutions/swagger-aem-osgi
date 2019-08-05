function New-ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${cqPerioddamPeriods7damPerioddamchangeeventlistenerPeriodenabled}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties -ArgumentList @(
            ${cqPerioddamPeriods7damPerioddamchangeeventlistenerPeriodenabled}
        )
    }
}
