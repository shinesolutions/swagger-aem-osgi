function New-ComAdobeCqHistoryImplHistoryServiceImplInfo {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${pid},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${title},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${description},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ComAdobeCqHistoryImplHistoryServiceImplProperties]]
        ${properties},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${additionalProperties},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${bundleUnderscorelocation},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${serviceUnderscorelocation}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqHistoryImplHistoryServiceImplInfo' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqHistoryImplHistoryServiceImplInfo -ArgumentList @(
            ${pid},
            ${title},
            ${description},
            ${properties},
            ${additionalProperties},
            ${bundleUnderscorelocation},
            ${serviceUnderscorelocation}
        )
    }
}
