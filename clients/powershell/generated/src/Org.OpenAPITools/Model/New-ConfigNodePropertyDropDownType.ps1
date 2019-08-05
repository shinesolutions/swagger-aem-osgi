function New-ConfigNodePropertyDropDownType {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[String]]
        ${labels},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[String]]
        ${values}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ConfigNodePropertyDropDownType' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ConfigNodePropertyDropDownType -ArgumentList @(
            ${labels},
            ${values}
        )
    }
}
