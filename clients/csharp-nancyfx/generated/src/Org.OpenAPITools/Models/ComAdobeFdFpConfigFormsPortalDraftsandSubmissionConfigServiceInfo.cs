using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfo
    /// </summary>
    public sealed class ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfo:  IEquatable<ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfo>
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
        public ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfo()
        {
        }

        private ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfo(string Pid, string Title, string Description, ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfo.
        /// </summary>
        /// <returns>ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfoBuilder</returns>
        public static ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfoBuilder Builder()
        {
            return new ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfoBuilder</returns>
        public ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfoBuilder With()
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

        public bool Equals(ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfo</param>
        /// <param name="right">Compared (ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfo left, ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfo</param>
        /// <param name="right">Compared (ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfo left, ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfo.
        /// </summary>
        public sealed class ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties _Properties;

            internal ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfoBuilder Properties(ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfo.
            /// </summary>
            /// <returns>ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfo</returns>
            public ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfo Build()
            {
                Validate();
                return new ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfo(
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