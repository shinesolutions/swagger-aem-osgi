using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfo
    /// </summary>
    public sealed class ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfo:  IEquatable<ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfo>
    { 
        /// <summary>
        /// Pid
        /// </summary>
        public string Pid { get; private set; }

        /// <summary>
        /// Title
        /// </summary>
        public string Title { get; private set; }

        /// <summary>
        /// Description
        /// </summary>
        public string Description { get; private set; }

        /// <summary>
        /// Properties
        /// </summary>
        public ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfo()
        {
        }

        private ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfo(string Pid, string Title, string Description, ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfoBuilder</returns>
        public static ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfoBuilder Builder()
        {
            return new ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfoBuilder</returns>
        public ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfoBuilder With()
        {
            return Builder()
                .Pid(Pid)
                .Title(Title)
                .Description(Description)
                .Properties(Properties);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfo left, ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfo left, ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfo.
        /// </summary>
        public sealed class ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties _Properties;

            internal ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfoBuilder Properties(ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfo</returns>
            public ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfo Build()
            {
                Validate();
                return new ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfo(
                    Pid: _Pid,
                    Title: _Title,
                    Description: _Description,
                    Properties: _Properties
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}