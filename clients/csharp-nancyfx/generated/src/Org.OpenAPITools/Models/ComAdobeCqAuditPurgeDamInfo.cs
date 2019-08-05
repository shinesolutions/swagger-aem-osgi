using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqAuditPurgeDamInfo
    /// </summary>
    public sealed class ComAdobeCqAuditPurgeDamInfo:  IEquatable<ComAdobeCqAuditPurgeDamInfo>
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
        public ComAdobeCqAuditPurgeDamProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqAuditPurgeDamInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqAuditPurgeDamInfo()
        {
        }

        private ComAdobeCqAuditPurgeDamInfo(string Pid, string Title, string Description, ComAdobeCqAuditPurgeDamProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqAuditPurgeDamInfo.
        /// </summary>
        /// <returns>ComAdobeCqAuditPurgeDamInfoBuilder</returns>
        public static ComAdobeCqAuditPurgeDamInfoBuilder Builder()
        {
            return new ComAdobeCqAuditPurgeDamInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqAuditPurgeDamInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqAuditPurgeDamInfoBuilder</returns>
        public ComAdobeCqAuditPurgeDamInfoBuilder With()
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

        public bool Equals(ComAdobeCqAuditPurgeDamInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqAuditPurgeDamInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqAuditPurgeDamInfo</param>
        /// <param name="right">Compared (ComAdobeCqAuditPurgeDamInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqAuditPurgeDamInfo left, ComAdobeCqAuditPurgeDamInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqAuditPurgeDamInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqAuditPurgeDamInfo</param>
        /// <param name="right">Compared (ComAdobeCqAuditPurgeDamInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqAuditPurgeDamInfo left, ComAdobeCqAuditPurgeDamInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqAuditPurgeDamInfo.
        /// </summary>
        public sealed class ComAdobeCqAuditPurgeDamInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqAuditPurgeDamProperties _Properties;

            internal ComAdobeCqAuditPurgeDamInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqAuditPurgeDamInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqAuditPurgeDamInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqAuditPurgeDamInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqAuditPurgeDamInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqAuditPurgeDamInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqAuditPurgeDamInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqAuditPurgeDamInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqAuditPurgeDamInfoBuilder Properties(ComAdobeCqAuditPurgeDamProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqAuditPurgeDamInfo.
            /// </summary>
            /// <returns>ComAdobeCqAuditPurgeDamInfo</returns>
            public ComAdobeCqAuditPurgeDamInfo Build()
            {
                Validate();
                return new ComAdobeCqAuditPurgeDamInfo(
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