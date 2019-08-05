using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheFelixSystemreadyImplComponentsCheckInfo
    /// </summary>
    public sealed class OrgApacheFelixSystemreadyImplComponentsCheckInfo:  IEquatable<OrgApacheFelixSystemreadyImplComponentsCheckInfo>
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
        public OrgApacheFelixSystemreadyImplComponentsCheckProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheFelixSystemreadyImplComponentsCheckInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheFelixSystemreadyImplComponentsCheckInfo()
        {
        }

        private OrgApacheFelixSystemreadyImplComponentsCheckInfo(string Pid, string Title, string Description, OrgApacheFelixSystemreadyImplComponentsCheckProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheFelixSystemreadyImplComponentsCheckInfo.
        /// </summary>
        /// <returns>OrgApacheFelixSystemreadyImplComponentsCheckInfoBuilder</returns>
        public static OrgApacheFelixSystemreadyImplComponentsCheckInfoBuilder Builder()
        {
            return new OrgApacheFelixSystemreadyImplComponentsCheckInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheFelixSystemreadyImplComponentsCheckInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheFelixSystemreadyImplComponentsCheckInfoBuilder</returns>
        public OrgApacheFelixSystemreadyImplComponentsCheckInfoBuilder With()
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

        public bool Equals(OrgApacheFelixSystemreadyImplComponentsCheckInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheFelixSystemreadyImplComponentsCheckInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheFelixSystemreadyImplComponentsCheckInfo</param>
        /// <param name="right">Compared (OrgApacheFelixSystemreadyImplComponentsCheckInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheFelixSystemreadyImplComponentsCheckInfo left, OrgApacheFelixSystemreadyImplComponentsCheckInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheFelixSystemreadyImplComponentsCheckInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheFelixSystemreadyImplComponentsCheckInfo</param>
        /// <param name="right">Compared (OrgApacheFelixSystemreadyImplComponentsCheckInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheFelixSystemreadyImplComponentsCheckInfo left, OrgApacheFelixSystemreadyImplComponentsCheckInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheFelixSystemreadyImplComponentsCheckInfo.
        /// </summary>
        public sealed class OrgApacheFelixSystemreadyImplComponentsCheckInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheFelixSystemreadyImplComponentsCheckProperties _Properties;

            internal OrgApacheFelixSystemreadyImplComponentsCheckInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheFelixSystemreadyImplComponentsCheckInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheFelixSystemreadyImplComponentsCheckInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixSystemreadyImplComponentsCheckInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheFelixSystemreadyImplComponentsCheckInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixSystemreadyImplComponentsCheckInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheFelixSystemreadyImplComponentsCheckInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixSystemreadyImplComponentsCheckInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheFelixSystemreadyImplComponentsCheckInfoBuilder Properties(OrgApacheFelixSystemreadyImplComponentsCheckProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheFelixSystemreadyImplComponentsCheckInfo.
            /// </summary>
            /// <returns>OrgApacheFelixSystemreadyImplComponentsCheckInfo</returns>
            public OrgApacheFelixSystemreadyImplComponentsCheckInfo Build()
            {
                Validate();
                return new OrgApacheFelixSystemreadyImplComponentsCheckInfo(
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