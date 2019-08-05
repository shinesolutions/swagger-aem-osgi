using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfo
    /// </summary>
    public sealed class ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfo:  IEquatable<ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfo>
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
        public ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfo()
        {
        }

        private ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfo(string Pid, string Title, string Description, ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfo.
        /// </summary>
        /// <returns>ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfoBuilder</returns>
        public static ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfoBuilder Builder()
        {
            return new ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfoBuilder</returns>
        public ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfoBuilder With()
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

        public bool Equals(ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfo left, ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfo</param>
        /// <param name="right">Compared (ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfo left, ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfo.
        /// </summary>
        public sealed class ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties _Properties;

            internal ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfoBuilder Properties(ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfo.
            /// </summary>
            /// <returns>ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfo</returns>
            public ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfo Build()
            {
                Validate();
                return new ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfo(
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