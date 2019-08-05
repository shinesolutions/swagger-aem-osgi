function New-ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${cqPerioddamPeriodscene7PerioddamchangeeventlistenerPeriodenabled},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${cqPerioddamPeriodscene7PerioddamchangeeventlistenerPeriodobservedPeriodpaths}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties -ArgumentList @(
            ${cqPerioddamPeriodscene7PerioddamchangeeventlistenerPeriodenabled},
            ${cqPerioddamPeriodscene7PerioddamchangeeventlistenerPeriodobservedPeriodpaths}
        )
    }
}
