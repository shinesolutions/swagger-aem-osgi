using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmMsmImplServletsAuditLogServletInfo
    /// </summary>
    public sealed class ComDayCqWcmMsmImplServletsAuditLogServletInfo:  IEquatable<ComDayCqWcmMsmImplServletsAuditLogServletInfo>
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
        public ComDayCqWcmMsmImplServletsAuditLogServletProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmMsmImplServletsAuditLogServletInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmMsmImplServletsAuditLogServletInfo()
        {
        }

        private ComDayCqWcmMsmImplServletsAuditLogServletInfo(string Pid, string Title, string Description, ComDayCqWcmMsmImplServletsAuditLogServletProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmMsmImplServletsAuditLogServletInfo.
        /// </summary>
        /// <returns>ComDayCqWcmMsmImplServletsAuditLogServletInfoBuilder</returns>
        public static ComDayCqWcmMsmImplServletsAuditLogServletInfoBuilder Builder()
        {
            return new ComDayCqWcmMsmImplServletsAuditLogServletInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmMsmImplServletsAuditLogServletInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmMsmImplServletsAuditLogServletInfoBuilder</returns>
        public ComDayCqWcmMsmImplServletsAuditLogServletInfoBuilder With()
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

        public bool Equals(ComDayCqWcmMsmImplServletsAuditLogServletInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmMsmImplServletsAuditLogServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmMsmImplServletsAuditLogServletInfo</param>
        /// <param name="right">Compared (ComDayCqWcmMsmImplServletsAuditLogServletInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmMsmImplServletsAuditLogServletInfo left, ComDayCqWcmMsmImplServletsAuditLogServletInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmMsmImplServletsAuditLogServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmMsmImplServletsAuditLogServletInfo</param>
        /// <param name="right">Compared (ComDayCqWcmMsmImplServletsAuditLogServletInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmMsmImplServletsAuditLogServletInfo left, ComDayCqWcmMsmImplServletsAuditLogServletInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmMsmImplServletsAuditLogServletInfo.
        /// </summary>
        public sealed class ComDayCqWcmMsmImplServletsAuditLogServletInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqWcmMsmImplServletsAuditLogServletProperties _Properties;

            internal ComDayCqWcmMsmImplServletsAuditLogServletInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMsmImplServletsAuditLogServletInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqWcmMsmImplServletsAuditLogServletInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMsmImplServletsAuditLogServletInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqWcmMsmImplServletsAuditLogServletInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMsmImplServletsAuditLogServletInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqWcmMsmImplServletsAuditLogServletInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMsmImplServletsAuditLogServletInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqWcmMsmImplServletsAuditLogServletInfoBuilder Properties(ComDayCqWcmMsmImplServletsAuditLogServletProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmMsmImplServletsAuditLogServletInfo.
            /// </summary>
            /// <returns>ComDayCqWcmMsmImplServletsAuditLogServletInfo</returns>
            public ComDayCqWcmMsmImplServletsAuditLogServletInfo Build()
            {
                Validate();
                return new ComDayCqWcmMsmImplServletsAuditLogServletInfo(
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