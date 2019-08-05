using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfo
    /// </summary>
    public sealed class ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfo:  IEquatable<ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfo>
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
        public ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfo()
        {
        }

        private ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfo(string Pid, string Title, string Description, ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfo.
        /// </summary>
        /// <returns>ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfoBuilder</returns>
        public static ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfoBuilder Builder()
        {
            return new ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfoBuilder</returns>
        public ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfoBuilder With()
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

        public bool Equals(ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfo</param>
        /// <param name="right">Compared (ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfo left, ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfo</param>
        /// <param name="right">Compared (ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfo left, ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfo.
        /// </summary>
        public sealed class ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties _Properties;

            internal ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfoBuilder Properties(ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfo.
            /// </summary>
            /// <returns>ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfo</returns>
            public ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfo Build()
            {
                Validate();
                return new ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfo(
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