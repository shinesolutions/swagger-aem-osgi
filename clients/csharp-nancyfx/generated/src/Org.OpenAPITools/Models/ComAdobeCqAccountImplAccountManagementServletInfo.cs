using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqAccountImplAccountManagementServletInfo
    /// </summary>
    public sealed class ComAdobeCqAccountImplAccountManagementServletInfo:  IEquatable<ComAdobeCqAccountImplAccountManagementServletInfo>
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
        public ComAdobeCqAccountImplAccountManagementServletProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqAccountImplAccountManagementServletInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqAccountImplAccountManagementServletInfo()
        {
        }

        private ComAdobeCqAccountImplAccountManagementServletInfo(string Pid, string Title, string Description, ComAdobeCqAccountImplAccountManagementServletProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqAccountImplAccountManagementServletInfo.
        /// </summary>
        /// <returns>ComAdobeCqAccountImplAccountManagementServletInfoBuilder</returns>
        public static ComAdobeCqAccountImplAccountManagementServletInfoBuilder Builder()
        {
            return new ComAdobeCqAccountImplAccountManagementServletInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqAccountImplAccountManagementServletInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqAccountImplAccountManagementServletInfoBuilder</returns>
        public ComAdobeCqAccountImplAccountManagementServletInfoBuilder With()
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

        public bool Equals(ComAdobeCqAccountImplAccountManagementServletInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqAccountImplAccountManagementServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqAccountImplAccountManagementServletInfo</param>
        /// <param name="right">Compared (ComAdobeCqAccountImplAccountManagementServletInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqAccountImplAccountManagementServletInfo left, ComAdobeCqAccountImplAccountManagementServletInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqAccountImplAccountManagementServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqAccountImplAccountManagementServletInfo</param>
        /// <param name="right">Compared (ComAdobeCqAccountImplAccountManagementServletInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqAccountImplAccountManagementServletInfo left, ComAdobeCqAccountImplAccountManagementServletInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqAccountImplAccountManagementServletInfo.
        /// </summary>
        public sealed class ComAdobeCqAccountImplAccountManagementServletInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqAccountImplAccountManagementServletProperties _Properties;

            internal ComAdobeCqAccountImplAccountManagementServletInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqAccountImplAccountManagementServletInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqAccountImplAccountManagementServletInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqAccountImplAccountManagementServletInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqAccountImplAccountManagementServletInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqAccountImplAccountManagementServletInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqAccountImplAccountManagementServletInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqAccountImplAccountManagementServletInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqAccountImplAccountManagementServletInfoBuilder Properties(ComAdobeCqAccountImplAccountManagementServletProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqAccountImplAccountManagementServletInfo.
            /// </summary>
            /// <returns>ComAdobeCqAccountImplAccountManagementServletInfo</returns>
            public ComAdobeCqAccountImplAccountManagementServletInfo Build()
            {
                Validate();
                return new ComAdobeCqAccountImplAccountManagementServletInfo(
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