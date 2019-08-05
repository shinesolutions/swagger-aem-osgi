using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo
    /// </summary>
    public sealed class OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo:  IEquatable<OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo>
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
        public OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo()
        {
        }

        private OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo(string Pid, string Title, string Description, OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo.
        /// </summary>
        /// <returns>OrgApacheFelixSystemreadyImplFrameworkStartCheckInfoBuilder</returns>
        public static OrgApacheFelixSystemreadyImplFrameworkStartCheckInfoBuilder Builder()
        {
            return new OrgApacheFelixSystemreadyImplFrameworkStartCheckInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheFelixSystemreadyImplFrameworkStartCheckInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheFelixSystemreadyImplFrameworkStartCheckInfoBuilder</returns>
        public OrgApacheFelixSystemreadyImplFrameworkStartCheckInfoBuilder With()
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

        public bool Equals(OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo</param>
        /// <param name="right">Compared (OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo left, OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo</param>
        /// <param name="right">Compared (OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo left, OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo.
        /// </summary>
        public sealed class OrgApacheFelixSystemreadyImplFrameworkStartCheckInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties _Properties;

            internal OrgApacheFelixSystemreadyImplFrameworkStartCheckInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheFelixSystemreadyImplFrameworkStartCheckInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheFelixSystemreadyImplFrameworkStartCheckInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheFelixSystemreadyImplFrameworkStartCheckInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheFelixSystemreadyImplFrameworkStartCheckInfoBuilder Properties(OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo.
            /// </summary>
            /// <returns>OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo</returns>
            public OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo Build()
            {
                Validate();
                return new OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo(
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