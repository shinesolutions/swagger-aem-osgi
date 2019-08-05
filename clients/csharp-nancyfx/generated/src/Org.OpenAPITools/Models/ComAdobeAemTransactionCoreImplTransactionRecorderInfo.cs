using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeAemTransactionCoreImplTransactionRecorderInfo
    /// </summary>
    public sealed class ComAdobeAemTransactionCoreImplTransactionRecorderInfo:  IEquatable<ComAdobeAemTransactionCoreImplTransactionRecorderInfo>
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
        public ComAdobeAemTransactionCoreImplTransactionRecorderProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeAemTransactionCoreImplTransactionRecorderInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeAemTransactionCoreImplTransactionRecorderInfo()
        {
        }

        private ComAdobeAemTransactionCoreImplTransactionRecorderInfo(string Pid, string Title, string Description, ComAdobeAemTransactionCoreImplTransactionRecorderProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeAemTransactionCoreImplTransactionRecorderInfo.
        /// </summary>
        /// <returns>ComAdobeAemTransactionCoreImplTransactionRecorderInfoBuilder</returns>
        public static ComAdobeAemTransactionCoreImplTransactionRecorderInfoBuilder Builder()
        {
            return new ComAdobeAemTransactionCoreImplTransactionRecorderInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeAemTransactionCoreImplTransactionRecorderInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeAemTransactionCoreImplTransactionRecorderInfoBuilder</returns>
        public ComAdobeAemTransactionCoreImplTransactionRecorderInfoBuilder With()
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

        public bool Equals(ComAdobeAemTransactionCoreImplTransactionRecorderInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeAemTransactionCoreImplTransactionRecorderInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeAemTransactionCoreImplTransactionRecorderInfo</param>
        /// <param name="right">Compared (ComAdobeAemTransactionCoreImplTransactionRecorderInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeAemTransactionCoreImplTransactionRecorderInfo left, ComAdobeAemTransactionCoreImplTransactionRecorderInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeAemTransactionCoreImplTransactionRecorderInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeAemTransactionCoreImplTransactionRecorderInfo</param>
        /// <param name="right">Compared (ComAdobeAemTransactionCoreImplTransactionRecorderInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeAemTransactionCoreImplTransactionRecorderInfo left, ComAdobeAemTransactionCoreImplTransactionRecorderInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeAemTransactionCoreImplTransactionRecorderInfo.
        /// </summary>
        public sealed class ComAdobeAemTransactionCoreImplTransactionRecorderInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeAemTransactionCoreImplTransactionRecorderProperties _Properties;

            internal ComAdobeAemTransactionCoreImplTransactionRecorderInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeAemTransactionCoreImplTransactionRecorderInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeAemTransactionCoreImplTransactionRecorderInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeAemTransactionCoreImplTransactionRecorderInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeAemTransactionCoreImplTransactionRecorderInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeAemTransactionCoreImplTransactionRecorderInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeAemTransactionCoreImplTransactionRecorderInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeAemTransactionCoreImplTransactionRecorderInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeAemTransactionCoreImplTransactionRecorderInfoBuilder Properties(ComAdobeAemTransactionCoreImplTransactionRecorderProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeAemTransactionCoreImplTransactionRecorderInfo.
            /// </summary>
            /// <returns>ComAdobeAemTransactionCoreImplTransactionRecorderInfo</returns>
            public ComAdobeAemTransactionCoreImplTransactionRecorderInfo Build()
            {
                Validate();
                return new ComAdobeAemTransactionCoreImplTransactionRecorderInfo(
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