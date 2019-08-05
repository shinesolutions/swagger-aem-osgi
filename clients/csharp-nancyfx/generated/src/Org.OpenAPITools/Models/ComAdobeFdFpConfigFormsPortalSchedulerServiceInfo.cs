using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeFdFpConfigFormsPortalSchedulerServiceInfo
    /// </summary>
    public sealed class ComAdobeFdFpConfigFormsPortalSchedulerServiceInfo:  IEquatable<ComAdobeFdFpConfigFormsPortalSchedulerServiceInfo>
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
        public ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeFdFpConfigFormsPortalSchedulerServiceInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeFdFpConfigFormsPortalSchedulerServiceInfo()
        {
        }

        private ComAdobeFdFpConfigFormsPortalSchedulerServiceInfo(string Pid, string Title, string Description, ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeFdFpConfigFormsPortalSchedulerServiceInfo.
        /// </summary>
        /// <returns>ComAdobeFdFpConfigFormsPortalSchedulerServiceInfoBuilder</returns>
        public static ComAdobeFdFpConfigFormsPortalSchedulerServiceInfoBuilder Builder()
        {
            return new ComAdobeFdFpConfigFormsPortalSchedulerServiceInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeFdFpConfigFormsPortalSchedulerServiceInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeFdFpConfigFormsPortalSchedulerServiceInfoBuilder</returns>
        public ComAdobeFdFpConfigFormsPortalSchedulerServiceInfoBuilder With()
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

        public bool Equals(ComAdobeFdFpConfigFormsPortalSchedulerServiceInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeFdFpConfigFormsPortalSchedulerServiceInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeFdFpConfigFormsPortalSchedulerServiceInfo</param>
        /// <param name="right">Compared (ComAdobeFdFpConfigFormsPortalSchedulerServiceInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeFdFpConfigFormsPortalSchedulerServiceInfo left, ComAdobeFdFpConfigFormsPortalSchedulerServiceInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeFdFpConfigFormsPortalSchedulerServiceInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeFdFpConfigFormsPortalSchedulerServiceInfo</param>
        /// <param name="right">Compared (ComAdobeFdFpConfigFormsPortalSchedulerServiceInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeFdFpConfigFormsPortalSchedulerServiceInfo left, ComAdobeFdFpConfigFormsPortalSchedulerServiceInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeFdFpConfigFormsPortalSchedulerServiceInfo.
        /// </summary>
        public sealed class ComAdobeFdFpConfigFormsPortalSchedulerServiceInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties _Properties;

            internal ComAdobeFdFpConfigFormsPortalSchedulerServiceInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeFdFpConfigFormsPortalSchedulerServiceInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeFdFpConfigFormsPortalSchedulerServiceInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeFdFpConfigFormsPortalSchedulerServiceInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeFdFpConfigFormsPortalSchedulerServiceInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeFdFpConfigFormsPortalSchedulerServiceInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeFdFpConfigFormsPortalSchedulerServiceInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeFdFpConfigFormsPortalSchedulerServiceInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeFdFpConfigFormsPortalSchedulerServiceInfoBuilder Properties(ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeFdFpConfigFormsPortalSchedulerServiceInfo.
            /// </summary>
            /// <returns>ComAdobeFdFpConfigFormsPortalSchedulerServiceInfo</returns>
            public ComAdobeFdFpConfigFormsPortalSchedulerServiceInfo Build()
            {
                Validate();
                return new ComAdobeFdFpConfigFormsPortalSchedulerServiceInfo(
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