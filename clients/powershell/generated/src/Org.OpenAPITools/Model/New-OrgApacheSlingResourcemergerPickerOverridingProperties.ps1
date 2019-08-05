function New-OrgApacheSlingResourcemergerPickerOverridingProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${mergePeriodroot},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${mergePeriodreadOnly}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingResourcemergerPickerOverridingProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingResourcemergerPickerOverridingProperties -ArgumentList @(
            ${mergePeriodroot},
            ${mergePeriodreadOnly}
        )
    }
}
