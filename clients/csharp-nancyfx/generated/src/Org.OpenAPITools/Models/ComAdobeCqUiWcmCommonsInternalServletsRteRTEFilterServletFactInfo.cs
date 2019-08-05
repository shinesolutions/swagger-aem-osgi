using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfo
    /// </summary>
    public sealed class ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfo:  IEquatable<ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfo>
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
        public ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfo()
        {
        }

        private ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfo(string Pid, string Title, string Description, ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfo.
        /// </summary>
        /// <returns>ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfoBuilder</returns>
        public static ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfoBuilder Builder()
        {
            return new ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfoBuilder</returns>
        public ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfoBuilder With()
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

        public bool Equals(ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfo</param>
        /// <param name="right">Compared (ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfo left, ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfo</param>
        /// <param name="right">Compared (ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfo left, ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfo.
        /// </summary>
        public sealed class ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties _Properties;

            internal ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfoBuilder Properties(ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfo.
            /// </summary>
            /// <returns>ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfo</returns>
            public ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfo Build()
            {
                Validate();
                return new ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfo(
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