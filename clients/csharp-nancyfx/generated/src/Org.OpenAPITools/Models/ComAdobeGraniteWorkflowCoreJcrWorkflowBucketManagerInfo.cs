using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo
    /// </summary>
    public sealed class ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo:  IEquatable<ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo>
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
        public ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo()
        {
        }

        private ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo(string Pid, string Title, string Description, ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo.
        /// </summary>
        /// <returns>ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfoBuilder</returns>
        public static ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfoBuilder Builder()
        {
            return new ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfoBuilder</returns>
        public ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfoBuilder With()
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

        public bool Equals(ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo left, ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo</param>
        /// <param name="right">Compared (ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo left, ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo.
        /// </summary>
        public sealed class ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties _Properties;

            internal ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfoBuilder Properties(ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo.
            /// </summary>
            /// <returns>ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo</returns>
            public ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo Build()
            {
                Validate();
                return new ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo(
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