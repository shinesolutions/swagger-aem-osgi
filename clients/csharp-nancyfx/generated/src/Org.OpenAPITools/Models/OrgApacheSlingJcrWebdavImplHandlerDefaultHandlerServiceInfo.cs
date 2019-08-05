using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo
    /// </summary>
    public sealed class OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo:  IEquatable<OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo>
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
        public OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo()
        {
        }

        private OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo(string Pid, string Title, string Description, OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo.
        /// </summary>
        /// <returns>OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfoBuilder</returns>
        public static OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfoBuilder Builder()
        {
            return new OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfoBuilder</returns>
        public OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfoBuilder With()
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

        public bool Equals(OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo</param>
        /// <param name="right">Compared (OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo left, OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo</param>
        /// <param name="right">Compared (OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo left, OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo.
        /// </summary>
        public sealed class OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties _Properties;

            internal OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfoBuilder Properties(OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo.
            /// </summary>
            /// <returns>OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo</returns>
            public OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo Build()
            {
                Validate();
                return new OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo(
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