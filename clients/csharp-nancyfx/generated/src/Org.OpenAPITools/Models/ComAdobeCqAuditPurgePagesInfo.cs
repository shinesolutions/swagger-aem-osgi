using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqAuditPurgePagesInfo
    /// </summary>
    public sealed class ComAdobeCqAuditPurgePagesInfo:  IEquatable<ComAdobeCqAuditPurgePagesInfo>
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
        public ComAdobeCqAuditPurgePagesProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqAuditPurgePagesInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqAuditPurgePagesInfo()
        {
        }

        private ComAdobeCqAuditPurgePagesInfo(string Pid, string Title, string Description, ComAdobeCqAuditPurgePagesProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqAuditPurgePagesInfo.
        /// </summary>
        /// <returns>ComAdobeCqAuditPurgePagesInfoBuilder</returns>
        public static ComAdobeCqAuditPurgePagesInfoBuilder Builder()
        {
            return new ComAdobeCqAuditPurgePagesInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqAuditPurgePagesInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqAuditPurgePagesInfoBuilder</returns>
        public ComAdobeCqAuditPurgePagesInfoBuilder With()
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

        public bool Equals(ComAdobeCqAuditPurgePagesInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqAuditPurgePagesInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqAuditPurgePagesInfo</param>
        /// <param name="right">Compared (ComAdobeCqAuditPurgePagesInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqAuditPurgePagesInfo left, ComAdobeCqAuditPurgePagesInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqAuditPurgePagesInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqAuditPurgePagesInfo</param>
        /// <param name="right">Compared (ComAdobeCqAuditPurgePagesInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqAuditPurgePagesInfo left, ComAdobeCqAuditPurgePagesInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqAuditPurgePagesInfo.
        /// </summary>
        public sealed class ComAdobeCqAuditPurgePagesInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqAuditPurgePagesProperties _Properties;

            internal ComAdobeCqAuditPurgePagesInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqAuditPurgePagesInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqAuditPurgePagesInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqAuditPurgePagesInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqAuditPurgePagesInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqAuditPurgePagesInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqAuditPurgePagesInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqAuditPurgePagesInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqAuditPurgePagesInfoBuilder Properties(ComAdobeCqAuditPurgePagesProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqAuditPurgePagesInfo.
            /// </summary>
            /// <returns>ComAdobeCqAuditPurgePagesInfo</returns>
            public ComAdobeCqAuditPurgePagesInfo Build()
            {
                Validate();
                return new ComAdobeCqAuditPurgePagesInfo(
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