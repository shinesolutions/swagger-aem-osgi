using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfo
    /// </summary>
    public sealed class ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfo:  IEquatable<ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfo>
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
        public ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfo()
        {
        }

        private ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfo(string Pid, string Title, string Description, ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfoBuilder</returns>
        public static ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfoBuilder Builder()
        {
            return new ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfoBuilder</returns>
        public ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfo left, ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfo left, ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties _Properties;

            internal ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfoBuilder Properties(ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfo</returns>
            public ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfo(
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